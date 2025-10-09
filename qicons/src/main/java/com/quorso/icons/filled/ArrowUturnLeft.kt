package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) {
            return _ArrowUturnLeft!!
        }
        _ArrowUturnLeft = ImageVector.Builder(
            name = "Filled.ArrowUturnLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineTo(4.81f, 8.25f)
                horizontalLineTo(15f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -10.5f)
                horizontalLineTo(4.81f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                close()
            }
        }.build()

        return _ArrowUturnLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnLeft: ImageVector? = null
