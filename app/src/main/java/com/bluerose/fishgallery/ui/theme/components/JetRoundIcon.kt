package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.theme.OnSecondaryColor
import com.bluerose.fishgallery.ui.theme.PrimaryColor

@Composable
fun JetRoundIcon(
    vectorDrawable: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(OnSecondaryColor)
            .border(4.dp, OnPrimaryColor, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = vectorDrawable),
            contentDescription = null,
            tint = PrimaryColor
        )
    }
}

@Preview
@Composable
private fun JetRoundIconPreview() {
    JetRoundIcon(
        vectorDrawable = R.drawable.ic_bluerose,
        modifier = Modifier
    )
}