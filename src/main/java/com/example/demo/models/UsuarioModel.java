package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="t_user")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_user;

    @Column(nullable = false)
    private String tx_uid;

    @Column(nullable = false)
    private String tx_user;

    @Column(nullable = false)
    private String tx_email;

    @Column(nullable = false)
    private String tx_pass;

    @Column(nullable = false)
    private String tx_rol;

    @Column(nullable = false)
    private String tx_fullname;

    @Column(nullable = false)
    private String tx_avatar;

    public Integer getId_user() {
        return id_user;
    }
    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }
    public String getTx_uid() {
        return tx_uid;
    }
    public void setTx_uid(String tx_uid) {
        this.tx_uid = tx_uid;
    }
    public String getTx_user() {
        return tx_user;
    }
    public void setTx_user(String tx_user) {
        this.tx_user = tx_user;
    }
    public String getTx_email() {
        return tx_email;
    }
    public void setTx_email(String tx_email) {
        this.tx_email = tx_email;
    }
    public String getTx_pass() {
        return tx_pass;
    }
    public void setTx_pass(String tx_pass) {
        this.tx_pass = tx_pass;
    }
    public String getTx_rol() {
        return tx_rol;
    }
    public void setTx_rol(String tx_rol) {
        this.tx_rol = tx_rol;
    }
    public String getTx_fullname() {
        return tx_fullname;
    }
    public void setTx_fullname(String tx_fullname) {
        this.tx_fullname = tx_fullname;
    }
    public String getTx_avatar() {
        return tx_avatar;
    }
    public void setTx_avatar(String tx_avatar) {
        this.tx_avatar = tx_avatar;
    }

    
}
