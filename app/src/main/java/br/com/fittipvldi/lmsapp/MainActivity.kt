package br.com.fittipvldi.lmsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        imagem_login.setImageResource(R.drawable.imagem_login)

        botao_login.setOnClickListener {

            val user = "aluno"
            val password = "impacta"
            val nomeUsuario = campo_usuario.text.toString()
            val passwordUsuario = campo_password.text.toString()

            if(nomeUsuario == user && passwordUsuario == password) {
                Toast.makeText(this, "Login efetuado", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, TelaInicialActivity::class.java)
                val params = Bundle()
                params.putString("nome", nomeUsuario)
                intent.putExtras(params)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }

        }
    }
}