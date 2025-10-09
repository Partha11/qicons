package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Outlined.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.593f, 3.322f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                verticalLineTo(21f)
                lineTo(12f, 17.25f)
                lineTo(4.5f, 21f)
                verticalLineTo(5.507f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.507f, 48.507f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.186f, 0f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
