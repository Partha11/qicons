package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Bold: ImageVector
    get() {
        if (_Bold != null) {
            return _Bold!!
        }
        _Bold = ImageVector.Builder(
            name = "Filled.Bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.246f, 3.744f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(7.125f)
                arcToRelative(4.875f, 4.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.346f, 8.422f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.97f, 9.58f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                lineTo(5.247f, 3.744f)
                close()
                moveTo(12.371f, 10.494f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.25f)
                lineTo(8.246f, 5.244f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(4.125f)
                close()
                moveTo(8.246f, 12.745f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }.build()

        return _Bold!!
    }

@Suppress("ObjectPropertyName")
private var _Bold: ImageVector? = null
