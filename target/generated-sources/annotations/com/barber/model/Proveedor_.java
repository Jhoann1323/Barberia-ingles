package com.barber.model;

import com.barber.model.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-12T08:30:59")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> apellidos;
    public static volatile ListAttribute<Proveedor, Producto> productoList;
    public static volatile SingularAttribute<Proveedor, String> correo;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, Integer> numeroProveedor;
    public static volatile SingularAttribute<Proveedor, String> nombre;

}