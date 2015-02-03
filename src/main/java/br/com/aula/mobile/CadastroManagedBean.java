package br.com.aula.mobile;

import br.com.aula.mobile.business.Cadastro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "cadastroManagedBean")
@SessionScoped
public class CadastroManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Cadastro cadastro;
    private List<Cadastro> cadastros;
    
    
 
    public CadastroManagedBean() {
        this.cadastro = new Cadastro();
    }
    
    
    public void salvar(){
        System.out.println(cadastro.getNome());
        getCadastros().add(cadastro);
        
         
        FacesContext.getCurrentInstance()
                .addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso", null));
        
        this.cadastro = new Cadastro();
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public List<Cadastro> getCadastros() {
        if(cadastros == null){
            cadastros = new ArrayList<>();
        }
        return cadastros;
    }

    public void setCadastros(List<Cadastro> cadastros) {
        this.cadastros = cadastros;
    }
    
    
    
}
