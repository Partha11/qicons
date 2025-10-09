package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Pencil: ImageVector
    get() {
        if (_Pencil != null) {
            return _Pencil!!
        }
        _Pencil = ImageVector.Builder(
            name = "Filled.Pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.731f, 2.269f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.712f, 0f)
                lineToRelative(-1.157f, 1.157f)
                lineToRelative(3.712f, 3.712f)
                lineToRelative(1.157f, -1.157f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.712f)
                close()
                moveTo(19.513f, 8.199f)
                lineToRelative(-3.712f, -3.712f)
                lineToRelative(-12.15f, 12.15f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 2.214f)
                lineToRelative(-0.8f, 2.685f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.933f, 0.933f)
                lineToRelative(2.685f, -0.8f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.214f, -1.32f)
                lineTo(19.513f, 8.2f)
                close()
            }
        }.build()

        return _Pencil!!
    }

@Suppress("ObjectPropertyName")
private var _Pencil: ImageVector? = null
