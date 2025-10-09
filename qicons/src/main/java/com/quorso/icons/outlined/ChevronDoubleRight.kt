package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChevronDoubleRight: ImageVector
    get() {
        if (_ChevronDoubleRight != null) {
            return _ChevronDoubleRight!!
        }
        _ChevronDoubleRight = ImageVector.Builder(
            name = "Outlined.ChevronDoubleRight",
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
                moveToRelative(5.25f, 4.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
                moveToRelative(6f, -15f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
            }
        }.build()

        return _ChevronDoubleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleRight: ImageVector? = null
