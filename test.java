JAVA SPRING BOOT: 
 

1.Pregunta: ¿Cuál de las siguientes opciones es la forma correcta de definir un controlador REST en Spring Boot? 

Opciones: 

A) 

java 

Copiar código 

@RestController 
public class MyController { 
    @GetMapping("/hello") 
    public String sayHello() { 
        return "Hello, World!"; 
    } 
} 

B) 

@Controller 
public class MyController { 
    @RequestMapping("/hello") 
    public String sayHello() { 
        return "Hello, World!"; 
    } 
} 



2.Pregunta: ¿Cuál es el archivo correcto en Spring Boot para configurar las propiedades de conexión a la base de datos cuando se usa Spring Data JPA? 

Opciones: 

A) application.properties 

B) application.yml 

C) db.properties 

D) database-config.yml 

3.Pregunta: ¿Cuál de las siguientes anotaciones es utilizada para definir la clave primaria de una entidad en JPA? 

Opciones: 

A) @Column 

B) @Id 

C) @GeneratedValue 

D) @PrimaryKey 

4.Pregunta: ¿Cómo se realiza la inyección de dependencias en Spring Boot? 

Opciones: 

A) 

java 

Copiar código 

public class MyService { 

    private MyRepository myRepository = new MyRepository(); 

} 

B) 

java 

Copiar código 

public class MyService { 

    @Autowired 

    private MyRepository myRepository; 

} 

C) 

java 

Copiar código 

public class MyService { 

    private MyRepository myRepository; 

 

    public MyService(MyRepository myRepository) { 

        this.myRepository = myRepository; 

    } 

} 

D) 

java 

Copiar código 

public class MyService { 

    @Inject 

    private MyRepository myRepository; 

} 

5.Pregunta: ¿Cuál de las siguientes es la forma correcta de manejar excepciones en un controlador REST en Spring Boot? 

Opciones: 

A) 

java 

Copiar código 

@RestController 

public class MyController { 

 

    @ExceptionHandler(Exception.class) 

    public String handleException() { 

        return "An error occurred!"; 

    } 

} 

B) 

java 

Copiar código 

@RestController 

public class MyController { 

 

    @ExceptionHandler(Exception.class) 

    public ResponseEntity<String> handleException() { 

        return new ResponseEntity<>("An error occurred!", HttpStatus.INTERNAL_SERVER_ERROR); 

    } 

} 

C) 

java 

Copiar código 

@RestController 

public class MyController { 

 

    @RequestMapping("/handleException") 

    public String handleException() { 

        return "An error occurred!"; 

    } 

} 

D) 

java 

Copiar código 

@RestController 

public class MyController { 

 

    @ExceptionHandler(Exception.class) 

    public void handleException() { 

        // Handle the exception without returning any response 

    } 

} 