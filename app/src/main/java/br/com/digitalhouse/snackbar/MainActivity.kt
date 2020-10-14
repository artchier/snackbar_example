package br.com.digitalhouse.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //Log.i(TAG, "Olá mundo cruel")
            showSnackbar("Olá mundo cruel")
        }
    }

    fun showSnackbar(msg: String){
        val snack = Snackbar.make(snack_layout, msg, Snackbar.LENGTH_SHORT)
        snack.setAction("Ok", View.OnClickListener {
            Log.i(TAG, "Sucesso")
        })
        snack.show()
    }
}