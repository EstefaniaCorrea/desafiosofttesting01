package pages;

public class AmazonSearchPage extends BasePage {

    private String buscador = "field-keywords"; //Selector por Nombre
    private String botonBuscar = "nav-search-submit-button"; //Selector por ID
    private String botonPagina2 = "//a[@aria-label='Ir a la página 2' and @href]";// Selector XPath
    private String producto3 = "(//div[@data-cy='title-recipe']/a)[3]"; // Selector Absoluto XPath 
    private String selectorPlegable = "select[name='quantity']"; // Selector Css
    private String numProductos = "//*[@id=\"quantity_1\"]"; // Selector XPath
    private String botonAgregarCarrito = "//input[@title='Agregar al Carrito']"; // Selector XPath
    private String avisoValidacion = "//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"; // Selector XPath
// 
    //Constructor
    public AmazonSearchPage() {
        super(driver);
    }

    // Metodo para navegar a la pagina de Amazon
    public void navegarA() {
        navegarA("https://www.amazon.com");
    }

    // Metodo que ingresa datos en la barra de busqueda
    public void buscarProducto(String busqueda){
        escribir(buscador, busqueda);
        clicarElementoId(botonBuscar);
    }

    // Metodo para ir a una pagina 
    public void navegarPagina(){
        clicarPagina(botonPagina2);
    }

    //Metodo para Clicar el 3er producto
    public void seleccionarProducto(){
        clicarElementoXpath(producto3);
    }
    
    //Metodo para seleccionar numero de productos
    public void anadirSelectorPlegable(){
        selecionarElementoListaDes(selectorPlegable, numProductos, botonAgregarCarrito, 1);
    }

    // Metodo para realizar validaciones al finalizar de agregar cada producto al carrito de compras
    public void validarMensaje(){
        validarTexto(avisoValidacion);
    }
}
