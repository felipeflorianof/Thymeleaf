package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {

	@Autowired
	private PedidoRepository repository;

    @GetMapping("/home")
    public String home(Model model) {

    	List<Pedido> pedidos = repository.findAll();
    	model.addAttribute("pedidos", pedidos);
    	
        return "home";
    }
    
    @GetMapping("/aguardando")
    public String aguardando(Model model) {

    	List<Pedido> pedidos = repository.findByStatus(StatusPedido.AGUARDANDO);
    	model.addAttribute("pedidos", pedidos);
    	
        return "home";
    }
    
    @GetMapping("/entregue")
    public String entregue(Model model) {

    	List<Pedido> pedidos = repository.findByStatus(StatusPedido.ENTREGUE);
    	model.addAttribute("pedidos", pedidos);
    	
        return "home";
    }
    
    @GetMapping("/aprovado")
    public String aprovado(Model model) {

    	List<Pedido> pedidos = repository.findByStatus(StatusPedido.APROVADO);
    	model.addAttribute("pedidos", pedidos);
    	
        return "home";
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
    	return "redirect:/home";
    }
}
