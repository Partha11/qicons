package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Bell: ImageVector
    get() {
        if (_Bell != null) {
            return _Bell!!
        }
        _Bell = ImageVector.Builder(
            name = "Filled.Bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.25f, 9f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 2.123f, 0.8f, 4.057f, 2.118f, 5.52f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.297f, 1.206f)
                curveToRelative(-1.544f, 0.57f, -3.16f, 0.99f, -4.831f, 1.243f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.48f, 0f)
                arcToRelative(24.585f, 24.585f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.831f, -1.244f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.298f, -1.205f)
                arcTo(8.217f, 8.217f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 9.75f)
                lineTo(5.25f, 9f)
                close()
                moveTo(9.752f, 17.9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.496f, 0f)
                arcToRelative(25.057f, 25.057f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.496f, 0f)
                close()
            }
        }.build()

        return _Bell!!
    }

@Suppress("ObjectPropertyName")
private var _Bell: ImageVector? = null
