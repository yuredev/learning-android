package yuretadseaj.ufrn.navegacao

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var navigateButton: Button

    override fun onPause() {
        Log.i("Mensagem", "onPause chamado")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Mensagem", "onStop chamado")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Mensagem", "onDestroy chamado")
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.navigateButtonToB).setOnClickListener {
//            no android quando queremos acessar algo
//            temos que fazer uma Intent (intenção) de fazer algo
//            para navegar entre telas temos que fazer uma Intent de navegação

//            declarando Intent de navegação para a outra tela
            val intent = Intent(this, ScreenB::class.java)
//            o Bundle() serve para declararmos uma variável que servirá
//            de parametro para a outra tela
//            é como um hashmap
            val param = Bundle()

            param.putString("texto", "em briga de saci todo chute é voadora")
            param.putDouble("valor", 21.8847)
            intent.putExtras(param)

//            usamos o startActivity para passar para outra tela
            startActivity(intent)
//            quando precisamos que a outra tela retorne algo
//            usamos o
//            startActivityForResult()
        }

        findViewById<Button>(R.id.navigateButtonToC).setOnClickListener {
//            o segundo parametro é um código que simboliza de onde a tela esta retornando
//            exemplo
//            caso seja passado um 2 por valor
//            ao retornar para esta tela no método onActivityResult
            startActivityForResult(Intent(this, ScreenC::class.java), 2)
        }
    }

//    método chamado toda vez que um activity retorna um result
//    requestCode é o código retornado daquela activityResult
//    resultCode é o resultado como Activity.RESULT_OK por exemplo
//    data é algum dado que seja retornado
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        when(resultCode) {
            Activity.RESULT_OK->{
//                dispara mensagem
                Toast.makeText(this, "voltou de ${if (requestCode == 2) "tela C" else " outra tela que não a C"}", Toast.LENGTH_SHORT).show()
            }
//            o result canceled vem geralmente quando o usuário cancela alguma operação
//            pode vir também quando o usuário clica no botão virtual de voltar
            Activity.RESULT_CANCELED->{
                Toast.makeText(this, "Cancelou operação", Toast.LENGTH_SHORT).show()
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}