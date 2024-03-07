package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab3.ui.theme.Lab3Theme
import androidx.compose.material3.Icon

import androidx.compose.runtime.*


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme val navController = rememberNavController()
             val navController = rememberNavController()
                friendsRatingApp()
            }
        }
    }
}

@Composable
fun friendsRatingApp()
{
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "friends") {
        composable("friends"){
            friends(navController)
        }
        composable("detailsActivity"){
            detailsActivity()
        }
    }
}

@Composable
fun lab3Activity2()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login")
    {
        composable("login"){
            logIn(navController = navController)
        }
        composable("register"){
            register(navController = navController)
        }
    }
}

val questions = listOf(
    "1. What callbacks are called when an app is first launched?",
    "2. What callbacks occur when home is pressed?",
    "3. What callbacks occur when an app is restart from the launcher?",
    "4. What callbacks occur when the device rotated?"
)

@Composable
fun activity1(navController:NavController)
{
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp,0.dp,0.dp,20.dp)
       ) {
       for(question in questions)
       {
           Card(Modifier.padding(8.dp)) {
               Text(
                   text = question,
                   fontSize = 20.sp,
                   fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                   fontStyle = FontStyle.Italic,
                   fontWeight = FontWeight.Bold
               )
           }

       }
   }

}

@Composable
fun logIn(navController: NavController)
{
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        OutlinedTextField(
            value = "Email",
            onValueChange = {},
            modifier = Modifier
                .padding(0.dp,20.dp,0.dp,0.dp)
        )
        OutlinedTextField(
            value = "Password",
            onValueChange = {},
            modifier = Modifier
                .padding(0.dp,20.dp,0.dp,0.dp)
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(0.dp,30.dp,0.dp,0.dp)
        ) {
            Text(
                text = "Log In",

            )

        }

        Text(
            text = "Not a member? Register here",
            color = Color.Blue,
            modifier = Modifier
                .clickable { navController.navigate("register") }
                .padding(0.dp, 40.dp, 0.dp, 0.dp)

        )

    }


}


@Composable
fun register(navController: NavController)
{
    Column(
        verticalArrangement =Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Full Name")},modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Email")},modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Password")},modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp))
        Button(onClick = {}, modifier = Modifier
            .padding(0.dp, 40.dp, 0.dp, 0.dp)
            .fillMaxWidth(.7f) ){
            Text(text = "REGISTER")
        }
        Text(
            text = "Already registered! Log In",
            modifier = Modifier
                .padding(0.dp, 40.dp, 0.dp, 0.dp)
                .clickable { navController.navigate("login") }
            ,
            color = Color.White,
            fontSize = 20.sp
        )
    }
}

data class Image(val imageId:Int, val name:String)

val ImageList = listOf<Image>(
    Image(imageId = R.drawable.rchel, name = "Rachel"),
    Image(imageId = R.drawable.ross, name = "Ross"),
    Image(imageId = R.drawable.rossgeller, name = "Ross Geller"),
    Image(imageId = R.drawable.monica_geller, name = "Monica Geller"),
    Image(imageId = R.drawable.square_monica, name = "Square Geller"),
    Image(imageId = R.drawable.men3, name = "Men"),


)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun friends(navController: NavController)
{

                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(10.dp,10.dp)
                ) {

                    Text(
                        text ="Friends",
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp
                    )

                    Text(text = "Click on a character to rate his acting,")

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                       // modifier = Modifier.background(Color.Cyan)
                    ){
                        items(ImageList){ (image,name)->

                               Column(

                                   verticalArrangement = Arrangement.SpaceEvenly,
                                   horizontalAlignment = Alignment.CenterHorizontally,
                                   modifier = Modifier
                                       .shadow(elevation = 1.dp)


                               ) {
                                   Box(
                                       modifier = Modifier
                                           .padding(2.dp)
                                           .clickable { navController.navigate("detailsActivity")}


                                   ) {
                                       Image(
                                           painter = painterResource(id = image),
                                           contentDescription = name,
                                           contentScale = ContentScale.Crop,
                                           modifier = Modifier
                                               .size(200.dp, 200.dp)
                                               //.fillMaxWidth(.5f)
                                               .clip(MaterialTheme.shapes.medium)
                                               .padding(12.dp)
                                       )

                                   }
                                   Text(text = name)
                                   Spacer(modifier = Modifier.height(8.dp))
                               }
                        }
                }
                }
}
@Composable
fun detailsActivity()
{
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.Cyan)
    ) {
        RatingBar()
        ImageCard( )
    }
}

@Composable
fun RatingBar() {
    var rating by remember { mutableStateOf(0) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        repeat(5) { index ->
            val isFilled = index < rating
            val starIcon = if (isFilled) Icons.Default.Star else Icons.Default.Star

            Icon(
                imageVector = starIcon,
                contentDescription = null,
                modifier = Modifier
                    .clickable {
                        rating = index + 1
                    }
                    .padding(4.dp)
                    .size(36.dp)
            )
        }
    }
}

@Composable
fun ImageCard()
{
    val imgId = 2
    Box(
        modifier = Modifier
            .background(Color.Blue)
    )
    {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = null,
            )
        Text(text ="Cool Friend")
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {

    Lab3Theme {

    }
}