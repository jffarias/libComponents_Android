# libComponents_Android
Clase para utilizar algunos componentes básicos de Android.

1 - Creamos una clase con el contenido anterior.   
2 - Importamos la clase   
```java
import com.example.example.Components;
```
3 - Definimos una variable global de tipo Components(Depende como hayas llamado tu clase)

```java
Components libComponents;
```

4 - Instanciamos;
```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libComponents = new Components();
    }
```

5 - Usamos el componente Toast
```java
libComponents.notificacion(getApplicationContext(), "Esto es toast en libComponents");
```
