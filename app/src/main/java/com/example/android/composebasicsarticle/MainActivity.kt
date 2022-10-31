package com.example.android.composebasicsarticle

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composebasicsarticle.ui.theme.ComposeBasicsArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(getString(R.string.article_title), getString(R.string.article_intro),
                        article = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                    )
                }
            }
        }
    }
}


@Composable
fun Article(title: String, intro: String, article: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)


    Column() {
        Image(painter = image, contentDescription = "Compose image", modifier = Modifier.fillMaxWidth())
        Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
        Text(text = intro, fontSize = 16.sp, modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify)
        Text(text = article, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicsArticleTheme {
        Article("Title", "Intro", "Article is bigger")
    }
}