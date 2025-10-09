package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowLongLeft: ImageVector
    get() {
        if (_ArrowLongLeft != null) {
            return _ArrowLongLeft!!
        }
        _ArrowLongLeft = ImageVector.Builder(
            name = "Filled.ArrowLongLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.28f, 7.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-2.47f, 2.47f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(4.81f)
                lineToRelative(2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                close()
            }
        }.build()

        return _ArrowLongLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongLeft: ImageVector? = null
