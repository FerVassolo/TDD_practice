package test;

import com.company.Carrito;
import com.company.Cashier;
import com.company.Producto;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckoutTest {

    // este test tiene muchos nombres.
    @Test
    public void test001_checkoutDeCarritoVacioDebeDar0pesos(){
        Carrito carrito = new Carrito();
        double montoTotal = new Cashier().checkout(carrito);

        assertEquals(montoTotal, 0.0);
    }


    // Fijate que hay mucho comportamiento que me queda colgado, hay que explicar un montón de cosas.
    // Es muy complejo y todavía ni siquiera estoy testeando el precio del producto.
    // Por cada comportamiento debería haber un test antes. Frenar y hacer test más chicos.
    // Testeamos, por ejemplo, primero el 'agregar' (test 3).
    @Ignore
    @Test
    public void test002_checkoutDeCarritoConUnProductoDe1PesoDebeDar1Pesos(){
        Carrito carrito = new Carrito();
        carrito.agregar(new Producto(1)); // 1 es el código de barras.
        double montoTotal = new Cashier().checkout(carrito);

        assertEquals(montoTotal, 1);
    }

}
