package syahrulridwan.com.example.intentexample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import srimulyaniadha.com.example.intentexample1.databinding.ActivitySecondBinding
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

    private val Log = Logger.getLogger(SecondActivity::class.java.name)
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.info("onCreate")
        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }

}