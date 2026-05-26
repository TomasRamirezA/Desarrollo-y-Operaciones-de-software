package edu.dosw.lab.Reto4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TransaccionTest {

    private CuentaBancaria cuenta;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Juan Pérez", 1, "ID1");
        cuenta = new CuentaBancaria("12345", cliente);
        cuenta.setSaldo(1000.0);
    }

    @Test
    void testDepositoIncrementaSaldo() {
        Transaccion deposito = new Transaccion(1, LocalDate.now(), 1, 500, cuenta);
        deposito.deposito();
        assertEquals(1500.0, cuenta.getSaldo(), 0.01);
    }

    @Test
    void testRetiroDisminuyeSaldo() {
        Transaccion retiro = new Transaccion(2, LocalDate.now(), 2, 200, cuenta);
        retiro.retiro();
        assertEquals(800.0, cuenta.getSaldo(), 0.01);
    }

    @Test
    void testRetiroSaldoInsuficienteLanzaExcepcion() {
        Transaccion retiro = new Transaccion(3, LocalDate.now(), 2, 2000, cuenta);
        assertThrows(IllegalArgumentException.class, retiro::retiro);
    }

    @Test
    void testDetallesConRetiro() {
        Transaccion retiro = new Transaccion(5, LocalDate.of(2025, 9, 1), 2, 150, cuenta);
        String detalles = retiro.detalles();
        System.out.println("Detalles generados: " + detalles);
        assertTrue(detalles.contains("Retiro"));
        assertTrue(detalles.contains("150.00"));
        assertTrue(detalles.contains("2025-09-01"));
        assertTrue(detalles.contains("12345"));
    }
}
