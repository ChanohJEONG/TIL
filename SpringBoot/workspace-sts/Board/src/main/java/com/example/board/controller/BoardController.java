package com.example.board.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.board.model.User;
import com.example.board.model.Board;
import com.example.board.repository.BoardRepository;

@Controller
public class BoardController {
	@Autowired
	BoardRepository boardRepository;
	@Autowired
	HttpSession session; // spinrg 내의 session값 다 불러와 사용할 수 있도록 선언

	@GetMapping("/board")
	public String board(Model model) {
		List<Board> list = boardRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
		model.addAttribute("list", list);
		return "board/list";
	}

	@GetMapping("/board/{id}")
	public String boardView(Model model, @PathVariable("id") long id) {
		Optional<Board> data = boardRepository.findById(id);
		Board board = data.get();
		model.addAttribute("board", board);
		return "board/view";
	}

	@GetMapping("/board/update/{id}")
	public String boardUpdate(Model model, @PathVariable("id") long id) {
		Optional<Board> data = boardRepository.findById(id);
		Board board = data.get();
		model.addAttribute("board", board);
		return "board/update";
	}

	@PostMapping("/board/update/{id}")
	public String boardUpdatePost(@ModelAttribute Board board, @PathVariable("id") long id) {
		User user = (User) session.getAttribute("user_info");
		String userId = user.getEmail();
		board.setUserId(userId);
		board.setId(id);
		boardRepository.save(board);
		return "redirect:/board/" + id;
	}

	@GetMapping("/board/write")
	public String boardWrite() {
		return "board/write";
	}

	@PostMapping("/board/write")
	public String boardWritePost(@ModelAttribute Board board) {// 사용자 입력을 받기 위해 사용, board.html에서 form으로 보낸 내용을 받아오는것
		User user = (User) session.getAttribute("user_info");// 로그인 된 사용자 정보 받아옴
		String userId = user.getEmail();// 받아온 user 정보중 이메일정보만 가져옴
		board.setUserId(userId);// email정보 추가해줌
		boardRepository.save(board);// 받아온 내용 저장
		return "board/write"; // DB저장
	}

	@GetMapping("/board/delete/{id}")
	public String boardDelete(@PathVariable("id") long id) {
		boardRepository.deleteById(id);
		return "redirect:/board";
	}

}//class