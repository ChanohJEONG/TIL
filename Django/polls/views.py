from django.shortcuts import render
from django.http import HttpResponse, HttpResponseRedirect
from .models import Question, Choice
from django.utils import timezone

def add_form(request):
  # data = request.GET['aa']
  data = request.GET.get('aa')

  return render(request, 'polls/add_form.html', {})

def add(request):
  # if request.method == 'GET':
    # ......
  # else:
    # POST 처리 코드
  question_text = request.POST.get('question')
  answer1 = request.POST.get('answer1')
  answer2 = request.POST.get('answer2')

  # question_text = request.POST['question']
  q = Question(
    question_text=question_text, 
    pub_date=timezone.now())
  q.save()

  # 보기 입력 1번 방식
  q.choice_set.create(choice_text=answer1, votes=0)

  # 보기 입력 2번 방식
  Choice(
    choice_text=answer2, votes=0, question=q).save()

  return HttpResponse('ok')

def free(request):
  return render(
    request, 'polls/freelancer.html', {})

def index(request):
  latest_question_list = Question.objects.order_by('-pub_date')[:10]
  output = ', '.join([q.question_text for q in latest_question_list])
  return render(
    request, 
    'polls/index.html', 
    {
      'latest_question_list':latest_question_list
    })

  # return HttpResponse(output)

def detail(request, question_id): # 질문 상세 페이지
  question = Question.objects.get(pk=question_id)
  return render(
    request, 'polls/detail.html', 
    {'question':question})

def results(request, question_id): # 투표 결과 페이지
  question = Question.objects.get(pk=question_id)
  choices = question.choice_set.all()
  
  # choices = Choice.objects.filter(question=question)

  return render(
    request, 'polls/results.html', 
    {'choices': choices})

#@csrf_expt
# ajax 호출 시 주로 사용, csrf 기능 무효화
def vote(request, question_id): # 투표 페이지
  num = request.POST['choice']
  choice = Choice.objects.get(pk=num)
  vote = choice.votes + 1 # 투표수 1 증가
  choice.votes = vote

  # choice.votes = choice.votes + 1 # 투표수 1 증가
  # choice.votes += 1 # 투표수 1 증가

  choice.save()

  return HttpResponse("You're voting on question %s." % question_id)