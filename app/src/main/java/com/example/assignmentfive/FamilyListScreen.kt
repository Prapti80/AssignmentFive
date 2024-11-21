package com.example.assignmentfive

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Composable to display the list

// for the note in kotlin jetpack compose there are a lazy column which done exact work of recyclerview in android


@Composable
fun FamilyListScreen(familyViewModel: FamilyViewModel) {
    val familyMembers = familyViewModel.familyMembers
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(familyMembers) { member ->
            FamilyMemberCard(member)
        }
    }
}

