import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapplicationcleancodearchitecture.R

@Composable
fun HomeScreenComposible(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight(fraction = 0.5f)
                .fillMaxWidth()
                .background(color = Color.DarkGray)
                .padding(10.dp)

        ) {
            Text(text = "Jakarta ", color = Color.White)
            Text(
                text = "Today , September 9 AM ", color = Color.White, fontWeight = FontWeight.Bold
            )
            Image(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .size(200.dp),
                painter = painterResource(id = R.drawable.ic_cloud),
                contentDescription = ""
            )
            Text(
                text = "18° C", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 60.sp
            )
            Text(
                text = "Cloudy", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 40.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenComposiblePreview() {
    HomeScreenComposible(modifier = Modifier)
}
