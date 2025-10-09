package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) {
            return _CursorArrowRipple!!
        }
        _CursorArrowRipple = ImageVector.Builder(
            name = "Filled.CursorArrowRipple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.303f, 5.197f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.697f, 15.803f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, 1.061f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.92f, -0.732f, -3.839f, -2.197f, -5.303f)
                close()
                moveTo(15.182f, 7.318f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.364f, 6.364f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.153f, -0.44f, -2.303f, -1.318f, -3.182f)
                close()
                moveTo(11.548f, 8.632f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 0.311f)
                lineToRelative(5.228f, 7.917f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.777f, 1.148f)
                lineToRelative(-2.097f, -0.43f)
                lineToRelative(1.045f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.45f, 0.388f)
                lineToRelative(-1.044f, -3.899f)
                lineToRelative(-1.601f, 1.42f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.247f, -0.606f)
                lineToRelative(0.569f, -9.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.554f, -0.68f)
                close()
            }
        }.build()

        return _CursorArrowRipple!!
    }

@Suppress("ObjectPropertyName")
private var _CursorArrowRipple: ImageVector? = null
