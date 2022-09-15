package dzianis.trakhimik.unitelycompose.entry.views.common.inputs

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun LoginTextInput(modifier: Modifier = Modifier, initialValue: String = "") {
    var currentValue by remember { mutableStateOf(initialValue) }
    OutlinedTextField(
        value = currentValue,
        onValueChange = {
            currentValue = it
        },
        modifier = modifier
    )
}

@Composable
fun EmailPasswordTextInput(modifier: Modifier = Modifier, initialValue: String = "") {
    var currentValue by remember { mutableStateOf(initialValue) }
    OutlinedTextField(
        value = currentValue,
        onValueChange = {
            currentValue = it
        },
        modifier = modifier
    )
}