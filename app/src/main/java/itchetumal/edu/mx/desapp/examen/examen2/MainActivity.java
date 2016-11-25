package itchetumal.edu.mx.desapp.examen.examen2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.activity_main);
        Lienzo fondo = new Lienzo(this);
        fondo.getHeight();
        layout1.addView(fondo);
    }

    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }


        protected void onDraw(Canvas canvas) {

            Paint pincel= new Paint();
            pincel.setColor(Color.BLACK);


            //Circulo 1
            pincel.setColor(Color.BLACK);
            canvas.drawCircle(370,400,canvas.getWidth()/2,pincel);
            pincel.setColor(Color.RED);
            canvas.drawText("1",360,canvas.getHeight()/2,pincel);

            //Circulo 2
            pincel.setColor(Color.BLUE);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-40,pincel);

            //Circulo 3
            pincel.setColor(Color.YELLOW);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-80,pincel);

            //Circulo 4
            pincel.setColor(Color.GRAY);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-120,pincel);

            //Circulo 5
            pincel.setColor(Color.CYAN);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-160,pincel);

            //Circulo 6
            pincel.setColor(Color.MAGENTA);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-200,pincel);

            //Circulo 7
            pincel.setColor(Color.WHITE);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-240,pincel);

            //Circulo 8
            pincel.setColor(Color.GREEN);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-280,pincel);

            //Circulo 9
            pincel.setColor(Color.DKGRAY);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-320,pincel);

            //Circulo 10
            pincel.setColor(Color.RED);
            canvas.drawCircle(370,400,(canvas.getWidth()/2)-340,pincel);

        }
    }
}
