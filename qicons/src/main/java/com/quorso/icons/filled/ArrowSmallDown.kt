package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowSmallDown: ImageVector
    get() {
        if (_ArrowSmallDown != null) {
            return _ArrowSmallDown!!
        }
        _ArrowSmallDown = ImageVector.Builder(
            name = "Filled.ArrowSmallDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(13.19f)
                lineToRelative(5.47f, -5.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-6.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                lineToRelative(-6.75f, -6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(5.47f, 5.47f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
            }
        }.build()

        return _ArrowSmallDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmallDown: ImageVector? = null
