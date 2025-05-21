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

    // Navegación en Amazon en la página web inicial
    public void navegarA() {
        navegarA("https://www.amazon.com");
    }

    // Llena el buscador con los datos
    public void buscarProducto(String busqueda){
        escribir(buscador, busqueda);
        clicarElementoId(botonBuscar);
    }

    // Abre la web amazon.com
    public void navegarPagina(){
        clicarPagina(botonPagina2);
    }

    //Se selecciona automaticamente el tercer producto de la lista
    public void seleccionarProducto(){
        clicarElementoXpath(producto3);
    }
    
    //Se selecciona el numero de productos a agregar al carrito
    public void anadirSelectorPlegable(){
        selecionarElementoListaDes(selectorPlegable, numProductos, botonAgregarCarrito, 1);
    }

    // Validaciones realizadas
    public void validarMensaje(){
        validarTexto(avisoValidacion);
    }
}
