


package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        float cash = 312;

        private int overcoat = 70;
        private int overcoatDiscount = 77;

        private int hat = 25;
        private int hatDiscount = 27;

        private int bisinesssuit = 53;
        private int bisinesssuitDiscount = 44;

        private int shite = 19;

        private int shoes = 41;
        private int shoesDiscount = 32;

        public boolean canbuywardrobe() {
            float result;
            result = (overcoat * overcoatDiscount + hat * hatDiscount + bisinesssuit
                    * bisinesssuitDiscount + shite + shoes * shoesDiscount) / 100;
            result = cash - result;
            if (result < 0) return false;
            else return true;

        }

        private float balance () {
            float result = -1;
            if (canbuywardrobe()) {
            }
            return result;
        }





        private TextView txt ;
        private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        TextView txt = findViewById (R.id.txt);
        TextView txt2 = findViewById (R.id.txt2);

        boolean cat = canbuywardrobe ();
        if (cat) {
            txt.setText (" мы можем купить гардероб");
            txt2.setText ("остаток от покупки"+balance ()+"серебрянных монет");
        } else {
            txt.setText (" мы не можем купить гардероб");
            txt2.setText ("-");

        }
    }
}