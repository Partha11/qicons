package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Language: ImageVector
    get() {
        if (_Language != null) {
            return _Language!!
        }
        _Language = ImageVector.Builder(
            name = "Filled.Language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.506f)
                arcToRelative(49.384f, 49.384f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.343f, 0.371f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.186f, 1.489f)
                curveToRelative(-0.66f, -0.083f, -1.323f, -0.151f, -1.99f, -0.206f)
                arcToRelative(18.67f, 18.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.97f, 6.323f)
                curveToRelative(0.318f, 0.384f, 0.65f, 0.753f, 1f, 1.107f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, 1.052f)
                arcTo(18.902f, 18.902f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13.687f)
                arcToRelative(18.823f, 18.823f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.656f, 4.482f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.688f, -1.333f)
                arcToRelative(17.323f, 17.323f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.396f, -4.353f)
                arcTo(18.72f, 18.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.89f, 8.598f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.388f, -0.568f)
                arcTo(17.21f, 17.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11.224f)
                arcToRelative(17.168f, 17.168f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.391f, -5.165f)
                arcToRelative(48.04f, 48.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.298f, 0.307f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.186f, -1.489f)
                arcToRelative(49.159f, 49.159f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.343f, -0.371f)
                lineTo(8.25f, 3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2.25f)
                close()
                moveTo(15.75f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 0.433f)
                lineToRelative(5.25f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.36f, 0.634f)
                lineToRelative(-1.198f, -2.567f)
                horizontalLineToRelative(-6.744f)
                lineToRelative(-1.198f, 2.567f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, -0.634f)
                lineToRelative(5.25f, -11.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 9f)
                close()
                moveTo(13.078f, 17.25f)
                horizontalLineToRelative(5.344f)
                lineToRelative(-2.672f, -5.726f)
                lineToRelative(-2.672f, 5.726f)
                close()
            }
        }.build()

        return _Language!!
    }

@Suppress("ObjectPropertyName")
private var _Language: ImageVector? = null
