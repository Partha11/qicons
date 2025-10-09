package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) {
            return _ArrowTrendingDown!!
        }
        _ArrowTrendingDown = ImageVector.Builder(
            name = "Filled.ArrowTrendingDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.72f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineTo(9f, 11.69f)
                lineToRelative(3.756f, -3.756f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.985f, -0.066f)
                arcToRelative(12.698f, 12.698f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.575f, 6.832f)
                lineToRelative(0.308f, 1.149f)
                lineToRelative(2.277f, -3.943f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.299f, 0.75f)
                lineToRelative(-3.182f, 5.51f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.025f, 0.275f)
                lineToRelative(-5.511f, -3.181f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -1.3f)
                lineToRelative(3.943f, 2.277f)
                lineToRelative(-0.308f, -1.149f)
                arcToRelative(11.194f, 11.194f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.528f, -5.617f)
                lineToRelative(-3.809f, 3.81f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                lineTo(1.72f, 6.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.061f)
                close()
            }
        }.build()

        return _ArrowTrendingDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingDown: ImageVector? = null
