package com.kh.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeUpdateController
 */
@WebServlet("/update.no")
public class NoticeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//상세보기 페이지 -> 수정하기 페이지로 이동
		//해당 글 정보를 조회해서 수정하기페이지로 전달하기
		//수정하고자하는 공지글의 번호를 추출하기
		int nno = Integer.parseInt(request.getParameter("nno"));
		
		Notice n = new NoticeService().selectNotice(nno);
	
		request.setAttribute("n", n);
		
		//수정할 공지글 정보 담았으니 포워딩하기
		request.getRequestDispatcher("views/notice/noticeUpdateForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//공지글 변경해보기 updateNotice() 메소드명
		//성공시 변경성공 메세지 alert와 함께 해당 공지글 상세보기 페이지로 이동하기
		//실패시 에러페이지로 메시지와 함께 포워딩
		//from에서 전달한 title, content, noticeNo가 필요하다
		
		//post방식에서는 인코딩처리를 가장 먼저 해주기! 
		request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String nno = request.getParameter("nno");
		
		System.out.println(nno);
		
		int result = new NoticeService().updateNotice(title,content,nno);
		
		if(result>0) {
			//재요청할땐 request에 담아서 사용할 수 없음
			HttpSession session = request.getSession(); 
			session.setAttribute("alertMsg", "공지사항 수정 완료");
			response.sendRedirect(request.getContextPath()+"/detail.no?nno="+nno);
		}else {
			request.setAttribute("errorMsg", "공지사항 수정 실패");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		}
	}

}
