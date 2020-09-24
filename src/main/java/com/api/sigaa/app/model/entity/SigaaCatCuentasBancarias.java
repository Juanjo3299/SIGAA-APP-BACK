package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CUENTAS_BANCARIAS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCuentasBancarias {
    private String numeroCuenta;
    private String banco;

    @Id
    @Column(name = "numeroCuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Basic
    @Column(name = "banco")
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatCuentasBancarias that = (SigaaCatCuentasBancarias) o;
        return Objects.equals(numeroCuenta, that.numeroCuenta) &&
                Objects.equals(banco, that.banco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta, banco);
    }
}
