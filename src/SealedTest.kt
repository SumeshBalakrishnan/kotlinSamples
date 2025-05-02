import NetworkStatus.*

fun main() {
    handleResultState(Loading)
    handleResultState(Success(User("Sumesh", 24)))
    handleResultState(ErrorType(Error("Success")))
}

fun handleResultState(state: NetworkStatus) {
    when (state) {
        is ErrorType -> {
            println(state.error.name)
        }

        Loading -> {
            println("Loading.....")
        }

        is Success -> {
            println(state.user.name)
        }
    }
}

sealed class NetworkStatus {
    object Loading : NetworkStatus()
    data class Success(var user: User) : NetworkStatus()
    data class ErrorType(var error: Error) : NetworkStatus()
}

data class User(var name: String, var age: Int)
data class Error(var name: String)