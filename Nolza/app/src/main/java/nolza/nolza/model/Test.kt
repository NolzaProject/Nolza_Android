package nolza.nolza.model

/**
 * Created by choijinjoo on 2017. 7. 5..
 */
data class Test(var name : String) {

    // 시작과 동시에 Validation.
    var age : Int = 0
      set(value) = if (value < 0) field = 0 else field = value


}