package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) {
            return _ArrowUturnDown!!
        }
        _ArrowUturnDown = ImageVector.Builder(
            name = "Filled.ArrowUturnDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 3.75f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, 9f)
                verticalLineToRelative(10.19f)
                lineToRelative(4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(4.72f, 4.72f)
                verticalLineTo(9f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
                close()
            }
        }.build()

        return _ArrowUturnDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnDown: ImageVector? = null
