package yuretadseaj.ufrn.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// dados dentro do ViewModel sobrevivem a mudanças de layout no aplicativo
// exemplo: caso o usuário gire a tela, o comportamento normal seria perder
// os dados que uma vez foram renderiazados nela, uma vez que a Activity é destruída.
// com dados dentro do ViewModel isso não acontece
class MainActivityViewModel : ViewModel() {
    var text = MutableLiveData("")
}