package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArchiveBoxXMark: ImageVector
    get() {
        if (_ArchiveBoxXMark != null) {
            return _ArchiveBoxXMark!!
        }
        _ArchiveBoxXMark = ImageVector.Builder(
            name = "Outlined.ArchiveBoxXMark",
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
                moveToRelative(20.25f, 7.5f)
                lineToRelative(-0.625f, 10.632f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.247f, 2.118f)
                horizontalLineTo(6.622f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.247f, -2.118f)
                lineTo(3.75f, 7.5f)
                moveToRelative(6f, 4.125f)
                lineToRelative(2.25f, 2.25f)
                moveToRelative(0f, 0f)
                lineToRelative(2.25f, 2.25f)
                moveTo(12f, 13.875f)
                lineToRelative(2.25f, -2.25f)
                moveTo(12f, 13.875f)
                lineToRelative(-2.25f, 2.25f)
                moveTo(3.375f, 7.5f)
                horizontalLineToRelative(17.25f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3.375f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                close()
            }
        }.build()

        return _ArchiveBoxXMark!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveBoxXMark: ImageVector? = null
