package tr.com.nuritiras.hicritakvimonemligunlvegeceler

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickOnayla(view: View) {
        val editTextAyIsmi = findViewById<EditText>(R.id.editTextAyIsmi)
        val editTextTextMultiLine = findViewById<EditText>(R.id.editTextTextMultiLine)
        var sonuc:String = ""
        when (editTextAyIsmi.text.toString()) {
            "Zilkade", "Zilhicce", "Muharrem","Recep" -> sonuc="Haram Ay\n"
            "Rebiülahir" -> sonuc="bolluk ve bereket mevsiminin sonu.\n"
            "Cemaziyelevvel" -> sonuc="Hz. Ali (Ra.) bu ayda dünyaya gelmiştir.\n"
            "Cemaziyelahir" -> sonuc="İkinci soğuk ay ya da kuraklığın sonu.\n"
            "Recep", "Şaban", "Ramazan" -> sonuc="Üç Aylar\n"
            "Rebiülevvel" -> sonuc="Mevlid Kandili\n"
            "Şevval"  -> sonuc="Ramazan Bayramı\n"
            else -> sonuc= "Hatalı Giriş\n"
        }
        editTextTextMultiLine.setText(sonuc)
    }
}