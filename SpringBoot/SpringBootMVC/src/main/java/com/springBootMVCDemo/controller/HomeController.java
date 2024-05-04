package com.springBootMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
/*import org.springframework.web.bind.annotation.RequestParam;*/

import com.springBootMVCDemo.model.Alien;

/*import com.springBootMVCDemo.model.Alien;*/
/*import org.springframework.web.servlet.ModelAndView;*/

/*import jakarta.servlet.http.HttpServletRequest;*/
/*import jakarta.servlet.http.HttpSession;*/

@Controller
public class HomeController {
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Alien");
	}
	@GetMapping("/")
	private String home() {
		return "index.jsp";
	}
	
	//***********************************HttpServletRequest***********************************
	
	/*
	 * @GetMapping("/add") private String result(HttpServletRequest request) { int
	 * number1 = Integer.parseInt(request.getParameter("number1")); int number2 =
	 * Integer.parseInt(request.getParameter("number2"));
	 * 
	 * int result= number1+number2;
	 * 
	 * HttpSession session = request.getSession(); session.setAttribute("result",
	 * result); return "result.jsp"; }
	 */
	
	//***********************************RequestParam***********************************
	
	/*
	 * @GetMapping("/add") private String result(@RequestParam("number1") int
	 * number1,@RequestParam("number2") int number2 ,HttpSession session) {
	 * 
	 * int result= number1+number2; session.setAttribute("result", result); return
	 * "result.jsp"; }
	 */
	
	//***********************************ModelAndView***********************************
	
	/*
	 * @GetMapping("/add") private ModelAndView result(@RequestParam("number1") int
	 * number1,@RequestParam("number2") int number2) {
	 * 
	 * ModelAndView modelView= new ModelAndView(); modelView.setViewName("result");
	 * int result= number1+number2;
	 * 
	 * modelView.addObject("result", result);
	 * 
	 * return modelView; }
	 */
	
	//***********************************Model and ModelMp***********************************
	
	/*
	 * @GetMapping("/add") private String result(@RequestParam("number1") int
	 * number1,@RequestParam("number2") int number2,ModelMap modelMap) { int result=
	 * number1+number2; modelMap.addAttribute("result", result);
	 * 
	 * return "result"; }
	 */
	
//	  @GetMapping("/getAlien") 
//	  private String result(@RequestParam("aid") int aid,@RequestParam("aname") String aname,ModelMap modelMap) { 
//		  Alien alien = new Alien();
//		  alien.setId(aid);
//		  alien.setName(aname);
//		  modelMap.addAttribute("alien", alien);
//	  
//		  return "result";
//	  }
	  
	/*
	 * @GetMapping("/getAlien") private String result(Alien alien,Model model) {
	 * 
	 * model.addAttribute("alien", alien); return "result"; }
	 */
	  
	
	/*
	 * @GetMapping("/getAlien") private String result(Alien alien) { return
	 * "result"; }
	 */
	 
	 
	
	//***********************************ModelAttribute***********************************
	
	  @GetMapping("/getAlien") private String result(@ModelAttribute("alien") Alien
	  alien) { return "result"; }
	 
}
