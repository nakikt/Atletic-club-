package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private Kluby_lekkoatletyczneDAO dao;

	@Autowired
	private PracownicyDAO daoP;

	@Autowired
	private FilieDAO daoF;

	@Autowired
	private ObozyDAO daoO;

	@Autowired
	private ZawodnicyDAO daoZ;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "index";
	}

	@RequestMapping("/index.html")
	public String viewHomePage2(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "index";
	}

	@RequestMapping("/login.html")
	public String login(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "login";
	}
	

	@RequestMapping("/register.html")
	public String register(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "register";
	}

	@RequestMapping("/tabele.html")
	public String viewTabele(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "tabele";
	}

	@RequestMapping("/zawodnicy.html")
	public String viewZawodnicy(Model model) {
		List<Zawodnicy> listZawodnicy = daoZ.list();
		model.addAttribute("listZawodnicy", listZawodnicy);
		return "zawodnicy";
	}

	@RequestMapping("/filie.html")
	public String viewFilie(Model model) {
		List<Filie> listFilie = daoF.list();
		model.addAttribute("listFilie", listFilie);
		return "filie";
	}

	@RequestMapping("/obozy.html")
	public String viewObozy(Model model) {
		List<Obozy> listObozy = daoO.list();
		model.addAttribute("listObozy", listObozy);
		return "obozy";
	}

	@RequestMapping("/pracownicy.html")
	public String viewPracownicy(Model model) {
		List<Pracownicy> listPracownicy = daoP.list();
		model.addAttribute("listPracownicy", listPracownicy);
		return "pracownicy";
	}

	@RequestMapping("/filie-add.html")
	public String addFilie(Model model) {
		List<Filie> listFilie = daoF.list();
		model.addAttribute("listFilie", listFilie);
		return "filie-add";
	}

	@RequestMapping("/obozy-add.html")
	public String addObozy(Model model) {
		List<Obozy> listObozy = daoO.list();
		model.addAttribute("listObozy", listObozy);
		return "obozy-add";
	}

	@RequestMapping("/pracownicy-add.html")
	public String addPracownicy(Model model) {
		List<Pracownicy> listPracownicy = daoP.list();
		model.addAttribute("listPracownicy", listPracownicy);
		return "pracownicy-add";
	}

	@RequestMapping("/zawodnicy-add.html")
	public String addZawodnicy(Model model) {
		List<Zawodnicy> listZawodnicy = daoZ.list();
		model.addAttribute("listZawodnicy", listZawodnicy);
		return "zawodnicy-add";
	}

	@RequestMapping("/filie-edit.html")
	public String editFilie(Model model) {
		List<Filie> listFilie = daoF.list();
		model.addAttribute("listFilie", listFilie);
		return "filie-edit";
	}

	@RequestMapping("/obozy-edit.html")
	public String editObozy(Model model) {
		List<Obozy> listObozy = daoO.list();
		model.addAttribute("listObozy", listObozy);
		return "obozy-edit";
	}

	@RequestMapping("/pracownicy-edit.html")
	public String editPracownicy(Model model) {
		List<Pracownicy> listPracownicy = daoP.list();
		model.addAttribute("listPracownicy", listPracownicy);
		return "pracownicy-edit";
	}

	@RequestMapping("/zawodnicy-edit.html")
	public String editZawodnicy(Model model) {
		List<Zawodnicy> listZawodnicy = daoZ.list();
		model.addAttribute("listZawodnicy", listZawodnicy);
		return "zawodnicy-edit";
	}

	@RequestMapping(value = "/filie/save", method = RequestMethod.POST)
	public String saveFilia(@ModelAttribute("Filie") Filie filie) {
		daoF.save(filie);

		return "redirect:/filie.html";
	}

	@RequestMapping(value = "/obozy/save", method = RequestMethod.POST)
	public String saveOboz(@ModelAttribute("Obozy") Obozy obozy) {
		daoO.save(obozy);

		return "redirect:/obozy.html";
	}

	@RequestMapping(value = "/pracownicy/save", method = RequestMethod.POST)
	public String savePracownik(@ModelAttribute("Pracownicy") Pracownicy pracownicy) {
		daoP.save(pracownicy);

		return "redirect:/pracownicy.html";
	}

	@RequestMapping(value = "/zawodnicy/save", method = RequestMethod.POST)
	public String saveZawodnik(@ModelAttribute("Zawodnicy") Zawodnicy zawodnicy) {
		daoZ.save(zawodnicy);

		return "redirect:/zawodnicy.html";
	}

	@RequestMapping("/filie/delete/{nr_filii}")
	public String deleteFilia(@PathVariable(name = "nr_filii") int nr_filii) {
		daoF.delete(nr_filii);

		return "redirect:/filie.html";
	}

	@RequestMapping("/zawodnicy/delete/{nr_zawodnika}")
	public String deleteZawodnik(@PathVariable(name = "nr_zawodnika") int nr_zawodnika) {
		daoZ.delete(nr_zawodnika);

		return "redirect:/zawodnicy.html";
	}

	@RequestMapping("/obozy/delete/{nr_obozu}")
	public String deleteOboz(@PathVariable(name = "nr_obozu") int nr_obozu) {
		daoO.delete(nr_obozu);

		return "redirect:/obozy.html";
	}

	@RequestMapping("/pracownicy/delete/{nr_pracownika}")
	public String deletePracownik(@PathVariable(name = "nr_pracownika") int nr_pracownika) {
		daoP.delete(nr_pracownika);

		return "redirect:/pracownicy.html";
	}

	@RequestMapping("/filie/edit/{nr_filii}")
	public ModelAndView editFilia(@PathVariable(name = "nr_filii") int nr_filii) {
		ModelAndView mav = new ModelAndView("filie-edit");
		Filie filie = daoF.get(nr_filii);
		mav.addObject("filie", filie);

		return mav;
	}

	@RequestMapping("/obozy/edit/{nr_obozu}")
	public ModelAndView editOboz(@PathVariable(name = "nr_obozu") int nr_obozu) {
		ModelAndView mav = new ModelAndView("obozy-edit");
		Obozy obozy = daoO.get(nr_obozu);
		mav.addObject("obozy", obozy);

		return mav;
	}

	@RequestMapping("/pracownicy/edit/{nr_pracownika}")
	public ModelAndView editPracownik(@PathVariable(name = "nr_pracownika") int nr_pracownika) {
		ModelAndView mav = new ModelAndView("pracownicy-edit");
		Pracownicy pracownicy = daoP.get(nr_pracownika);
		mav.addObject("pracownicy", pracownicy);

		return mav;
	}

	@RequestMapping("/zawodnicy/edit/{nr_zawodnika}")
	public ModelAndView editZawodnik(@PathVariable(name = "nr_zawodnika") int nr_zawodnika) {
		ModelAndView mav = new ModelAndView("zawodnicy-edit");
		Zawodnicy zawodnicy = daoZ.get(nr_zawodnika);
		mav.addObject("zawodnicy", zawodnicy);

		return mav;
	}

	@RequestMapping("/filie/edit/index.html")
	public String viewHomePage3(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/index.html";
	}

	@RequestMapping("/filie/edit/login.html")
	public String login2(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/login.html";
	}

	@RequestMapping("/filie/edit/tabele.html")
	public String viewTabele2(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/tabele.html";
	}

	@RequestMapping("/pracownicy/edit/index.html")
	public String viewHomePage4(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/index.html";
	}

	@RequestMapping("/pracownicy/edit/login.html")
	public String login3(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/login.html";
	}

	@RequestMapping("/pracownicy/edit/tabele.html")
	public String viewTabele3(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/tabele.html";
	}

	@RequestMapping("/zawodnicy/edit/index.html")
	public String viewHomePage5(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/index.html";
	}

	@RequestMapping("/zawodnicy/edit/login.html")
	public String login4(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/login.html";
	}

	@RequestMapping("/zawodnicy/edit/tabele.html")
	public String viewTabele4(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/tabele.html";
	}

	@RequestMapping("/obozy/edit/index.html")
	public String viewHomePage6(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/index.html";
	}

	@RequestMapping("/obozy/edit/login.html")
	public String login5(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/login.html";
	}

	@RequestMapping("/obozy/edit/tabele.html")
	public String viewTabele5(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "redirect:/tabele.html";
	}

	@RequestMapping(value = "filie/update", method = RequestMethod.POST)
	public String updateFilia(@ModelAttribute("filie") Filie filie) {
		daoF.update(filie);

		return "redirect:/filie.html";
	}

	@RequestMapping(value = "obozy/update", method = RequestMethod.POST)
	public String updateOboz(@ModelAttribute("obozy") Obozy obozy) {
		daoO.update(obozy);

		return "redirect:/obozy.html";
	}

	@RequestMapping(value = "pracownicy/update", method = RequestMethod.POST)
	public String updatePracownik(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
		daoP.update(pracownicy);

		return "redirect:/pracownicy.html";
	}

	@RequestMapping(value = "zawodnicy/update", method = RequestMethod.POST)
	public String updateZawodnicy(@ModelAttribute("zawodnicy") Zawodnicy zawodnicy) {
		daoZ.update(zawodnicy);

		return "redirect:/zawodnicy.html";
	}

	@RequestMapping("/430")
	public String accessDenied() {
		return "accessdenied.html";
	}

	@RequestMapping("/default.html")
	public String viewDefault(Model model) {
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		model.addAttribute("listKluby_lekkoatletyczne", listKluby_lekkoatletyczne);
		return "default";
	}
	
	@RequestMapping("/faillogin.html")
	public String accessDenied2() {
		return "faillogin";
	}


}
