package com.example.androiddevchallenge.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.DogDetails
import com.example.androiddevchallenge.MainViewModel
import kotlinx.coroutines.launch

@Composable
fun Home() {
    val snackbarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Dogs")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackbarHostState)
        }
    ) {
        val viewModel: MainViewModel = viewModel()
        DogList(viewModel.dogs) { dog ->
            viewModel.showDog(dog)
        }
        val dog = viewModel.currentDog
        if (dog != null) {
            DogDetails(dog) {
                coroutineScope.launch {
                    snackbarHostState.showSnackbar("You have adopted ${dog.name}")
                }
            }
        }
    }
}