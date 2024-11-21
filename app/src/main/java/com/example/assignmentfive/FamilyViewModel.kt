package com.example.assignmentfive

import androidx.lifecycle.ViewModel


// ViewModel to provide family data
class FamilyViewModel : ViewModel() {
    val familyMembers = listOf(
        FamilyMember("Pintu Chakrabarthy", "Father",45.00,"Govt Employee", R.drawable.father),
        FamilyMember("Bithi Rani Chakrabarthy", "Mother",40.00,"Housewife", R.drawable.mother),
        FamilyMember("Pranto Chakrabarthy", "Son",18.00,"Student", R.drawable.pranto),
        FamilyMember("Prapti Rani Chakrabarthy", "Daughter",22.00,"Student", R.drawable.prapti),
        FamilyMember("Raja Moyna Shingho Chakrabarthy", "Son",1.00,"Eat and Sleep", R.drawable.moyna),
        FamilyMember("Pookie Chakrabarthy", "Son",0.5,"Maramari", R.drawable.pookie),
        FamilyMember("Moynar Maa", "Cat's mom",3.00,"only want's to go to husband", R.drawable.mm),
        FamilyMember("Late Goyna Chakrabarthy", "daughter",0.9,"----", R.drawable.goyna)
    )
}