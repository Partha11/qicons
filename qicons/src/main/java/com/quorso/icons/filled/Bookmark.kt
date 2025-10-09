package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Filled.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.32f, 2.577f)
                arcToRelative(49.255f, 49.255f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.36f, 0f)
                curveToRelative(1.497f, 0.174f, 2.57f, 1.46f, 2.57f, 2.93f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.085f, 0.67f)
                lineTo(12f, 18.089f)
                lineToRelative(-7.165f, 3.583f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 21f)
                verticalLineTo(5.507f)
                curveToRelative(0f, -1.47f, 1.073f, -2.756f, 2.57f, -2.93f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
