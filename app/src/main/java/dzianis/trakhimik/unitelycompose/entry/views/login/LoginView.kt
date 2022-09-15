package dzianis.trakhimik.unitelycompose.entry.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dzianis.trakhimik.unitelycompose.entry.views.common.inputs.EmailPasswordTextInput
import dzianis.trakhimik.unitelycompose.entry.views.common.inputs.LoginTextInput

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .border(1.dp, MaterialTheme.colors.onSurface, RoundedCornerShape(10.dp))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is login page")
        LoginTextInput(modifier = Modifier.padding(24.dp), initialValue = "")
        EmailPasswordTextInput(modifier = Modifier.padding(24.dp), initialValue = "")
        Button(onClick = {}) {
            Text("LOGIN")
        }
    }
}