package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowPathRoundedSquare: ImageVector
    get() {
        if (_ArrowPathRoundedSquare != null) {
            return _ArrowPathRoundedSquare!!
        }
        _ArrowPathRoundedSquare = ImageVector.Builder(
            name = "Filled.ArrowPathRoundedSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 5.25f)
                curveToRelative(1.213f, 0f, 2.415f, 0.046f, 3.605f, 0.135f)
                arcToRelative(3.256f, 3.256f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 3.01f)
                curveToRelative(0.044f, 0.583f, 0.077f, 1.17f, 0.1f, 1.759f)
                lineTo(17.03f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-1.752f, 1.751f)
                curveToRelative(-0.023f, -0.65f, -0.06f, -1.296f, -0.108f, -1.939f)
                arcToRelative(4.756f, 4.756f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.392f, -4.392f)
                arcToRelative(49.422f, 49.422f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.436f, 0f)
                arcTo(4.756f, 4.756f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, 8.282f)
                curveToRelative(-0.017f, 0.224f, -0.033f, 0.447f, -0.046f, 0.672f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.497f, 0.092f)
                curveToRelative(0.013f, -0.217f, 0.028f, -0.434f, 0.044f, -0.651f)
                arcToRelative(3.256f, 3.256f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, -3.01f)
                curveToRelative(1.19f, -0.09f, 2.392f, -0.135f, 3.605f, -0.135f)
                close()
                moveTo(5.03f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(1.752f, -1.751f)
                curveToRelative(0.023f, 0.65f, 0.06f, 1.296f, 0.108f, 1.939f)
                arcToRelative(4.756f, 4.756f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.392f, 4.392f)
                arcToRelative(49.413f, 49.413f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.436f, 0f)
                arcToRelative(4.756f, 4.756f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.392f, -4.392f)
                curveToRelative(0.017f, -0.223f, 0.032f, -0.447f, 0.046f, -0.672f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.497f, -0.092f)
                curveToRelative(-0.013f, 0.217f, -0.028f, 0.434f, -0.044f, 0.651f)
                arcToRelative(3.256f, 3.256f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.01f, 3.01f)
                arcToRelative(47.953f, 47.953f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.21f, 0f)
                arcToRelative(3.256f, 3.256f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.01f, -3.01f)
                arcToRelative(47.759f, 47.759f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.1f, -1.759f)
                lineTo(6.97f, 15.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-3f, -3f)
                close()
            }
        }.build()

        return _ArrowPathRoundedSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPathRoundedSquare: ImageVector? = null
