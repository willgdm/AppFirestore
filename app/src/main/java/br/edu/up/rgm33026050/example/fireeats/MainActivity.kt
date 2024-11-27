package br.edu.up.rgm33026050.example.fireeats

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import br.edu.up.rgm33026050.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        Navigation.findNavController(this, R.id.nav_host_fragment)
            .setGraph(R.navigation.nav_graph)
    }
}