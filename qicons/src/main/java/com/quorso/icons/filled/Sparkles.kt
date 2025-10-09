package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) {
            return _Sparkles!!
        }
        _Sparkles = ImageVector.Builder(
            name = "Filled.Sparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.721f, 0.544f)
                lineToRelative(0.813f, 2.846f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.576f, 2.576f)
                lineToRelative(2.846f, 0.813f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.442f)
                lineToRelative(-2.846f, 0.813f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.576f, 2.576f)
                lineToRelative(-0.813f, 2.846f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.442f, 0f)
                lineToRelative(-0.813f, -2.846f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.576f, -2.576f)
                lineToRelative(-2.846f, -0.813f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.442f)
                lineToRelative(2.846f, -0.813f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.466f, 7.89f)
                lineToRelative(0.813f, -2.846f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4.5f)
                close()
                moveTo(18f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.728f, 0.568f)
                lineToRelative(0.258f, 1.036f)
                curveToRelative(0.236f, 0.94f, 0.97f, 1.674f, 1.91f, 1.91f)
                lineToRelative(1.036f, 0.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.456f)
                lineToRelative(-1.036f, 0.258f)
                curveToRelative(-0.94f, 0.236f, -1.674f, 0.97f, -1.91f, 1.91f)
                lineToRelative(-0.258f, 1.036f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.456f, 0f)
                lineToRelative(-0.258f, -1.036f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.91f, -1.91f)
                lineToRelative(-1.036f, -0.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.456f)
                lineToRelative(1.036f, -0.258f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.91f, -1.91f)
                lineToRelative(0.258f, -1.036f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 1.5f)
                close()
                moveTo(16.5f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.712f, 0.513f)
                lineToRelative(0.394f, 1.183f)
                curveToRelative(0.15f, 0.447f, 0.5f, 0.799f, 0.948f, 0.948f)
                lineToRelative(1.183f, 0.395f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.422f)
                lineToRelative(-1.183f, 0.395f)
                curveToRelative(-0.447f, 0.15f, -0.799f, 0.5f, -0.948f, 0.948f)
                lineToRelative(-0.395f, 1.183f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.422f, 0f)
                lineToRelative(-0.395f, -1.183f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.948f, -0.948f)
                lineToRelative(-1.183f, -0.395f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.422f)
                lineToRelative(1.183f, -0.395f)
                curveToRelative(0.447f, -0.15f, 0.799f, -0.5f, 0.948f, -0.948f)
                lineToRelative(0.395f, -1.183f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 15f)
                close()
            }
        }.build()

        return _Sparkles!!
    }

@Suppress("ObjectPropertyName")
private var _Sparkles: ImageVector? = null
