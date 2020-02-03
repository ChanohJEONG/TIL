from django.urls import path
from . import views
urlpatterns = [
  path('', views.index, name='index'),
  path('free/', views.free, name='free'),
  path('add_form/', views.add_form, name='add_form'),
  path('add/', views.add, name='add'),
  path('<int:question_id>/', views.detail, name='detail'),
  path('<int:question_id>/results/', views.results, name='results'),
  path('<int:question_id>/vote/', views.vote, name='vote'),
]