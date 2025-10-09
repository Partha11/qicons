package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowUturnUp: ImageVector
    get() {
        if (_ArrowUturnUp != null) {
            return _ArrowUturnUp!!
        }
        _ArrowUturnUp = ImageVector.Builder(
            name = "Filled.ArrowUturnUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.53f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                lineToRelative(-4.72f, -4.72f)
                verticalLineTo(15f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.5f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.5f, 0f)
                verticalLineTo(4.81f)
                lineTo(9.53f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                close()
            }
        }.build()

        return _ArrowUturnUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnUp: ImageVector? = null
