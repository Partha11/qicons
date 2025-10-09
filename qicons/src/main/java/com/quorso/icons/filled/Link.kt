package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Filled.Link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.902f, 4.098f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.304f, 0f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.035f, 6.037f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.646f, 1.353f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.449f, -8.45f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.424f, 7.424f)
                lineToRelative(-1.757f, 1.757f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.304f)
                close()
                moveTo(12.513f, 8.365f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -0.353f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.449f, 8.45f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.424f, -7.424f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.757f, 1.757f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.304f, 5.304f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.035f, -6.037f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.354f, -1f)
                close()
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
