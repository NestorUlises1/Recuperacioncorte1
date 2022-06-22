package com.example.recuperacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Producto extends AppCompatActivity {
    private TextView lblProducto,lblVenta,lblCompra,lblGanancia;
    private Button btnCalcular,btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        lblProducto=(TextView) findViewById(R.id.lblProducto);
        lblVenta=(TextView) findViewById(R.id.lblVenta);
        lblCompra=(TextView) findViewById(R.id.lblCompra);
        lblGanancia=(TextView) findViewById(R.id.lblGanancia);

        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnRegresar=(Button) findViewById(R.id.btnRegresar);



        Bundle bundle = getIntent().getExtras();
        String codigo = bundle.getString("Codigo");
        String descripcion = bundle.getString("Descripcion");
        String unidad = bundle.getString("Unidad");
        String venta = bundle.getString("Venta");
        String compra = bundle.getString("Compra");
        String cantidad = bundle.getString("Cantidad");

        float ventaprecio=Float.parseFloat(venta);
        float compraprecio=Float.parseFloat(compra);
        int cantidadpro=Integer.parseInt(cantidad);
        EntradaProducto eP = new EntradaProducto(codigo,descripcion,unidad,ventaprecio,compraprecio,cantidadpro);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblVenta.setText("Total Precio Venta                      "+eP.calcularPrecioVenta());
                lblCompra.setText("Total Precio Venta                      "+eP.calcularPrecioCompra());
                lblGanancia.setText("Total Ganancia                      "+eP.calcularPrecioGanancia());
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}